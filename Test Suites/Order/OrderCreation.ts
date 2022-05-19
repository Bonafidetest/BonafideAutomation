<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>OrderCreation</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>93ab0c0b-32dc-434c-857b-dcb8b352c36e</testSuiteGuid>
   <testCaseLink>
      <guid>7b53c5bf-84b3-4c0c-bdd3-8d6cc871f3ac</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>dfce1bbf-2b65-4b00-9c9e-c7f50c27b22d</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>dfce1bbf-2b65-4b00-9c9e-c7f50c27b22d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dfce1bbf-2b65-4b00-9c9e-c7f50c27b22d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>dfce1bbf-2b65-4b00-9c9e-c7f50c27b22d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3043fb5f-719e-44d2-b604-6e92c61e2e0a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/LogOut/logoutFromApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>28214fb7-e7f7-40f8-8dcc-7b6e3ed55ca0</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/Login/VIEMED_login</testCaseId>
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
      <guid>3b653766-dde1-4439-8e22-5e76772312d8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Order/OrderCreation</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>a852a4d7-2ff2-4063-b89d-95a82ebb7086</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/Order/orderCreation</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Customer ID</value>
         <variableId>5f844723-f81e-4bb8-9cd0-7c68d11cf0db</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Office</value>
         <variableId>0964237d-e1b2-4739-a9da-95fbb7274e0f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Ordered By</value>
         <variableId>26d3fe91-2087-4c60-8435-577bbe013fe8</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Sales Rep.</value>
         <variableId>bb944292-f2c5-49b7-b473-a7f986f12e41</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ICD10_1</value>
         <variableId>cb87f998-9640-45c7-a382-84d95f68c270</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SKU</value>
         <variableId>318091e2-e863-4bb1-8a58-08cd458cbe6f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FileClaim</value>
         <variableId>bc820d6d-2b3d-414e-a9b3-03fad3e565bc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Place of Service</value>
         <variableId>46dfc9c4-eb86-48af-858e-586f9483539e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>PhysicianFirstName</value>
         <variableId>1f8e115f-8b1a-429c-868e-19ba30bb8f1e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>a852a4d7-2ff2-4063-b89d-95a82ebb7086</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>CustomerLastName</value>
         <variableId>f93da575-5fb7-4275-bdcb-97d215601460</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>58438f47-10d2-45f7-bb16-089312196b99</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Order/orderChecklist</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9294f285-c030-452b-818c-353bf383f85b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Order/assignSKUDelivery</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
