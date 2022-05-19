<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>POCreation</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>d0cff88e-5353-427d-816a-88883456b0b6</testSuiteGuid>
   <testCaseLink>
      <guid>90df01e6-4eeb-46c8-98db-88ca19c3e31f</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>07f0c51e-78fa-4d71-a090-6f04dc09c0d0</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>07f0c51e-78fa-4d71-a090-6f04dc09c0d0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>07f0c51e-78fa-4d71-a090-6f04dc09c0d0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>07f0c51e-78fa-4d71-a090-6f04dc09c0d0</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>3842d53c-1453-4959-944a-6cb17ba79b15</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/LogOut/logoutFromApplication</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>28df20de-f46a-4ebb-9822-92a032cdbc13</guid>
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
      <guid>294a3e2a-f2fa-4435-bb15-a6cd39880016</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/PurchasingReceiving/poCreation</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>1fd08d2d-9e4f-4f31-821a-df9171020ca4</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/purchaseOrder</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>office</value>
         <variableId>443b3697-6bef-4bd2-aafd-104ddb9fed50</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>vendor</value>
         <variableId>60f192f6-9703-4179-ba10-c325181899c1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>shipto</value>
         <variableId>47d6e6d7-ec5f-4c48-b280-392ac5e6642e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>shipToOffice</value>
         <variableId>cefcb71d-4fdc-4919-8967-a30ad90af7cf</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>shipToCustomer</value>
         <variableId>dc7dba3d-7202-4c2a-b48f-388d97c1cac2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>shipVia</value>
         <variableId>190bdba2-380d-4d05-879e-c14fe2f2f5cc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>terms</value>
         <variableId>0fb97419-158f-40c5-b503-77fcd102a37c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>FOB</value>
         <variableId>5775d146-5d1f-455b-ba4b-c489b372ebf3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>freight</value>
         <variableId>8867e74a-5bf0-454e-a42c-cd18b206fc25</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>confirmation</value>
         <variableId>934ebdee-d9b9-40a1-a24a-be759d7c606e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>remarks</value>
         <variableId>db048c06-cea8-4575-8e64-9fe81f3c3041</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>tax</value>
         <variableId>819f8602-6419-42fa-8217-cbedf98d12fb</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>taxrate</value>
         <variableId>380edded-0c05-473f-99c5-cc4a30f9f6ac</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>specialInstruction</value>
         <variableId>8b3ba810-b793-4154-835a-b6a0d28dc730</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>customerLastName</value>
         <variableId>8823c43a-06a6-4f72-9da0-bff40ce0cf0e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>packages</value>
         <variableId>6bb3a449-303f-4b3e-997f-394fcf19531c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>HCPCS</value>
         <variableId>4e2c309a-fdbd-4be1-8892-d965596e7461</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>SKU</value>
         <variableId>02014f9a-5e8a-463b-a953-23b7035fa16a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>description</value>
         <variableId>ee99cd40-164f-4601-8d15-85bbdbb934cd</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>partNO</value>
         <variableId>1f0616ba-32a3-4343-bf22-3631b1f3fce6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>make</value>
         <variableId>7ccb0376-a7ab-4211-b2a1-7c9e827f0615</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>catalogNo</value>
         <variableId>29c92375-8b3a-4cdd-a985-a527a6d4397e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>POQty</value>
         <variableId>1ced3490-f092-4694-88f4-05354b557d99</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>1fd08d2d-9e4f-4f31-821a-df9171020ca4</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UnitCost</value>
         <variableId>1c88b91c-b415-4de3-b842-d1e7638a379f</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
