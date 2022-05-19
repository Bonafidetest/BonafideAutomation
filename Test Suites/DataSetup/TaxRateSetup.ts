<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>TaxRateSetup</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>f3e2ea55-2845-47c8-aa64-cc8e425a83d5</testSuiteGuid>
   <testCaseLink>
      <guid>8bb95222-58cf-472a-bdcc-86a21677a3d0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>564be4fb-1733-41d9-a6ff-ad582a032bac</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>564be4fb-1733-41d9-a6ff-ad582a032bac</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>564be4fb-1733-41d9-a6ff-ad582a032bac</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>564be4fb-1733-41d9-a6ff-ad582a032bac</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>c41e6fec-6088-4ef9-87f7-b7ec40bc6443</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Setup/Tax Rate Setup/updateTaxRate</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/dataSetup</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>State</value>
         <variableId>eb81a3bd-5328-4998-b360-e85225dbef7d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>County</value>
         <variableId>371ba31c-11c6-4bda-a752-0853da0e4205</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>City</value>
         <variableId>1e0e637c-013e-4158-938e-61eacc40d568</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>StateRate</value>
         <variableId>19abfe09-e44c-41f3-a647-7cdb26d8e5d2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>CountyRate</value>
         <variableId>ece80e80-fdfa-4e9e-802a-077b659384f4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>CityRate</value>
         <variableId>7f2c0190-4927-4436-b6f9-85d81eaa5b42</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ZipFrom</value>
         <variableId>bc2e0bca-0702-4372-ba41-199b88c4ac64</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ZipTo</value>
         <variableId>0210c10c-c7d3-4e22-a982-6ac658081cd4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ZipRate</value>
         <variableId>1d9753ca-64ca-4e01-91ad-71345a311e51</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>District</value>
         <variableId>f1ab895e-e43f-4e32-a144-d0fac49f24b4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>DistRate</value>
         <variableId>0ea0a47b-a5ed-45be-b37c-d648722b76a7</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EffectiveFrom</value>
         <variableId>07fd31fd-67dd-490f-9efd-1e49e79df212</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>ed80f6a9-b5c1-4ba6-b696-1680a39cdbf7</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>EffectiveTo</value>
         <variableId>89b33740-678c-4a08-bb92-664a21c9b799</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
