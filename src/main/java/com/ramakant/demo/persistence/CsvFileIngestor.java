package com.ramakant.demo.persistence;

import com.opencsv.CSVReader;
import com.ramakant.demo.domain.ReportItem;
import com.sun.media.sound.InvalidDataException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

@Component
public class CsvFileIngestor implements CommandLineRunner {

    protected final Log LOGGER = LogFactory.getLog(getClass());

    @Autowired
    private ReportItemRepository reportItemRepository;

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) {
        LOGGER.info("Filling in memory db with the data from csv files...");
        String filePath = args[0];
        LOGGER.info("Looking for csv files in " + filePath);

        File directory = new File(filePath);
        File[] files = directory.listFiles();

        if(files == null){
            LOGGER.info("No files found");
            return;
        }

        for (File file : files) {
            try {
                String fileName = file.getName();
                LOGGER.info("Processing file " + fileName);

                String[] splicedFileName = fileName.split("_");
                int month;

                if (splicedFileName.length < 3) {
                    throw new InvalidDataException("File name is not in correct format");
                }

                month = Integer.parseInt(splicedFileName[1]);

                List<ReportItem> items = new ArrayList<>();

                CSVReader reader = new CSVReader(new FileReader(file.getPath()));

                String[] record;

                int rowNumber = -1;
                while ((record = reader.readNext()) != null) {
                    rowNumber++;
                    if (rowNumber == 0) {
                        continue;
                    }
                    try {
                        ReportItem item = new ReportItem
                                (
                                        month,
                                        record[0],
                                        Long.parseLong(record[1].trim()),
                                        Long.parseLong(record[2].trim()),
                                        Integer.parseInt(record[3].trim()),
                                        Integer.parseInt(record[4].trim()),
                                        Double.parseDouble(record[5].trim()));

                        items.add(item);
                    } catch (NumberFormatException ex) {
                        //Ignore the row with bad data
                    }
                }

                reader.close();
                reportItemRepository.saveAll(items);

            } catch (Exception ex) {
                LOGGER.error(ex.getMessage());
            }
        }
    }
}

