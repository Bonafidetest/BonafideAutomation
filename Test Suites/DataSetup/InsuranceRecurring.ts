<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>InsuranceRecurring</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>3f5cc723-813e-46b9-9e69-9b830ba149a1</testSuiteGuid>
   <testCaseLink>
      <guid>481eb4e5-19ab-4f1a-a349-1108fe322ac2</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8604a2a9-32f2-4fbd-b56f-947f6ef675fe</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>8604a2a9-32f2-4fbd-b56f-947f6ef675fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8604a2a9-32f2-4fbd-b56f-947f6ef675fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8604a2a9-32f2-4fbd-b56f-947f6ef675fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>5bdb58f4-2b30-4ed5-91cd-11a580632544</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Data Setup/InsuranceRecurring/insuranceRecurring</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/dataSetup</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Title</value>
         <variableId>3989ef0a-6a68-4a44-986f-ac6344fd8478</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>HCPCSCHK</value>
         <variableId>2554f1fa-b9d1-4f77-b1cc-15bf8abab431</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Insurance</value>
         <variableId>81d3ab8b-58aa-42c6-bde7-9acfecc2a8ab</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Make</value>
         <variableId>f37c1bd6-0c62-4024-b3e0-e4761d77c4fc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PartNO</value>
         <variableId>d416caa7-c15c-4943-8fd3-27323b36ff97</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>HCPCS</value>
         <variableId>79f507bb-20e6-4ad9-9e97-97f9f722c64f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>RecurringFreq</value>
         <variableId>e88278dc-4ad4-46f3-85d0-854b879c4823</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Type</value>
         <variableId>2cbe4a83-62f4-4610-895b-dac56c2f3938</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Qty</value>
         <variableId>320c6fcb-9c9e-4e75-9d91-2d930064852e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>QtyType</value>
         <variableId>7d82165c-a64d-4a45-b2d4-9bc1d525ecc5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>MaxFreq</value>
         <variableId>d5210d1c-7db4-4817-a252-faa2e60d4a0e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>56955dcf-6f11-47a6-b5c7-072ee3acf2f4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>StartAfter</value>
         <variableId>35f2fcf2-e919-467d-9ace-94d3d5d317af</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
