<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>Search</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>a160932d-7030-45cf-b801-6a89bfc90883</testSuiteGuid>
   <testCaseLink>
      <guid>b96a6ea3-cbd3-4a56-b48a-94b202af5219</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>7a1cc2df-4d52-4000-9e20-7463922736ec</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>7a1cc2df-4d52-4000-9e20-7463922736ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>7a1cc2df-4d52-4000-9e20-7463922736ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>7a1cc2df-4d52-4000-9e20-7463922736ec</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>be396280-defb-4b48-996e-fd730aac69c9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/LogOut/logoutFromApplication</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>f7e239fb-5a92-4d93-bae7-1a9eb008bb18</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/VIEMED_login</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>842d9b06-91ef-4546-8544-64eae263fa73</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>ae55aee2-5a08-4d47-9ec2-af1af7f39b48</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>ecc3cd39-1ee5-4140-a3c0-add74acdeacb</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>02e6306e-ec24-495e-972e-c7b3315d66f3</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PurchasingReceiving/poSearch</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>8741f097-e867-460d-a320-67d39ddd37a1</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/purchaseOrder</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PO Office</value>
         <variableId>e151f3b2-31ac-4828-b483-7e65603f8c15</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PO Status</value>
         <variableId>8f1bb62e-0df1-46fc-9c8a-bf122ea2661d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PO Type</value>
         <variableId>a976b034-05fc-418e-bd83-42abf56bdfdc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PO Vendor</value>
         <variableId>a61f279a-6c7c-43cd-b484-3e7a1a7675dc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Reference No</value>
         <variableId>f9c8ddd1-c2e2-4199-b5ee-705fc7a58bfe</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Order No</value>
         <variableId>9b3e618d-fbcb-4f64-8d44-e6458bf49c28</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Request Date Form</value>
         <variableId>530c6691-11f4-49e1-850c-a06bb82ea859</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Request Date To</value>
         <variableId>20a289a9-8bfe-4d0e-b31d-7c07b0e5e9e5</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>8741f097-e867-460d-a320-67d39ddd37a1</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Created User</value>
         <variableId>1475077a-0966-4f74-bdc9-ded01e7df655</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>b19e55f9-9628-4922-b0d7-e7f9abea2ccd</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>03a093d5-5049-4dcf-987e-e03a7b51f9c9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>4576e09c-c7a1-4ed1-92e0-1033e7a62929</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>354c58a1-13dc-471d-97f9-9f7301c26245</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
