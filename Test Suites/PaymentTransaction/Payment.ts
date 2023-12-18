<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Payment</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>a8d494eb-49db-4168-b401-cd13ba54a0a6</testSuiteGuid>
   <testCaseLink>
      <guid>23a89b73-2eaa-454f-ae71-546e7fb6ad6a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d4ab217f-bcc3-47a8-8246-2a93efc3107d</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>d4ab217f-bcc3-47a8-8246-2a93efc3107d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d4ab217f-bcc3-47a8-8246-2a93efc3107d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d4ab217f-bcc3-47a8-8246-2a93efc3107d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>75aba8dc-15fd-4d5f-bfc3-fd7b4e29fcf6</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PaymentTransaction/invoicePayment</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>333b48b6-7cfc-498f-8430-aa8842f04bdf</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/payment</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>TransactionType</value>
         <variableId>e90eb27b-15a4-47eb-a1bc-d66bb0db7754</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>OrderNo</value>
         <variableId>c4c6533a-a879-480c-980d-58d7ef558e80</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>InvoiceNo</value>
         <variableId>1032d31a-dec3-4960-9e20-98d4b3923512</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Payor</value>
         <variableId>f1efa193-95e9-4a84-a74e-f9fd0de896be</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Insurance Company</value>
         <variableId>3ad57d35-6f4e-4cd2-9f26-1b8adba23236</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Customer ID</value>
         <variableId>fc12cd79-d4e1-4b7c-8ab7-e349a5c075df</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Note</value>
         <variableId>fde63108-78e5-438e-be3c-fff41f719cd2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Method</value>
         <variableId>865cbc51-d218-4925-b7a5-ba024116af9d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>333b48b6-7cfc-498f-8430-aa8842f04bdf</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Amount</value>
         <variableId>e8955feb-70b1-4e3a-8d54-fdd96f953ab6</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
