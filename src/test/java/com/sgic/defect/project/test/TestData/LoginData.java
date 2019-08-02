package com.sgic.defect.project.test.TestData;

import com.sgic.automation.orangehrm.utils.ExcelDataConfig;
import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class LoginData extends ExcelDataConfig {
  private static final Logger LOGGER = Logger.getLogger(LoginData.class);

  public LoginData () {
    super("src\\test\\resources\\ExcelSheet\\excel.xlsx");
  }
  @DataProvider
  public Object[][] OrangeHRMLogin() {

    int rows = getRowCount("Sheet1");
    int col = getColumnCount("Sheet1");


    LOGGER.info("row = "+ rows + " columns = "+ col);

    Object[][] data = new Object[rows][col];
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < col; j++) {
        data[i - 1][j] = getData("Sheet1", i, j);
      }
    }
    return data;
  }


}
