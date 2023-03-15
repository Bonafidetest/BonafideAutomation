<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>billSearch</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>4</numberOfRerun>
   <pageLoadTimeout>15</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>c2e9934e-120e-4773-a2c5-0ed8e426b229</testSuiteGuid>
   <testCaseLink>
      <guid>9bcd4234-1e17-4627-a111-fcec9d91f397</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Login/loginToApplication</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>bc925f95-6446-4b4e-a5da-efcc13ebe453</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/customerInfo</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>bc925f95-6446-4b4e-a5da-efcc13ebe453</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Company Name</value>
         <variableId>a913aea1-8ff7-4421-beed-2bb0c1d1ab4c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>bc925f95-6446-4b4e-a5da-efcc13ebe453</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>UserID</value>
         <variableId>534abf88-2c23-4bd6-b701-dfc5f691a1da</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>bc925f95-6446-4b4e-a5da-efcc13ebe453</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Password</value>
         <variableId>e7073a79-63c6-40e3-9649-3362b9abb996</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>14fcf0c4-bd3e-40b5-9ba1-777532b6dc71</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>false</isRun>
      <testCaseId>Test Cases/LogOut/logoutFromApplication</testCaseId>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
   </testCaseLink>
   <testCaseLink>
      <guid>30c7dbe3-175a-41e2-9240-ffcc8413e8cd</guid>
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
      <guid>b9b44e8c-8654-4369-ab0a-1da175039678</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/Billing/billSearch</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>04a3948d-d34c-45d1-9a73-aabf8d8841fe</id>
         <iterationEntity>
            <iterationType>RANGE</iterationType>
            <value>1-1</value>
         </iterationEntity>
         <testDataId>Data Files/billing</testDataId>
      </testDataLink>
      <usingDataBindingAtTestSuiteLevel>true</usingDataBindingAtTestSuiteLevel>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Order Number</value>
         <variableId>52d94573-6e08-4c65-8355-036aab6da018</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Order Office</value>
         <variableId>90b1a365-2f86-4d87-8fb9-5b6c3303658b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Month Form</value>
         <variableId>de11cc37-e719-41fd-a5c4-9f667d9d60a1</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Month To</value>
         <variableId>2affde06-d61f-4b6e-88dc-d30fff8e4861</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Start Bill Date</value>
         <variableId>55de2d54-5d80-4952-93d7-469a65675003</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>End Bill Date</value>
         <variableId>1f9f6ce6-b6ee-498c-a2e2-a93a01c3c7b9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>ClaIm Filling Group</value>
         <variableId>c83d3493-35b1-4ae6-a133-3910e14bedde</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Patient Insurance</value>
         <variableId>5bd57957-9371-42da-9034-5ef8e2ffd3ce</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Insurance Name</value>
         <variableId>1cbfd3f9-25f9-46a9-9160-4bb18e4e1bea</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Insurance Type</value>
         <variableId>8bf74afb-fcad-486d-bce9-453474de2936</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Bill-To/Ship-To/Patient</value>
         <variableId>eb6b6ef1-16d9-4fff-85ce-61376ce192ee</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Bill-To/Ship-To/Patient Name</value>
         <variableId>3e06403b-e02b-4ad2-a25e-fc99d9fab084</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Period</value>
         <variableId>4634f870-b380-46ce-8692-11d37383fe1e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Customer Type</value>
         <variableId>4ef3df8b-b122-4584-a05c-e35478971ed2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Item Type</value>
         <variableId>0144d288-c30b-4a5b-b1f5-1122bc8d8137</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Equipment Type</value>
         <variableId>bc49441c-1f96-461e-8d72-8f5fefc4e95f</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>HCPCS Code</value>
         <variableId>346ad0b1-9232-4c74-bd5c-045a16e8a282</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Enteral Order</value>
         <variableId>2fce4d34-8245-437d-8062-a80b5108dea8</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Oral Admin</value>
         <variableId>0a1ad142-8217-4600-89af-fa73ea5b3d5e</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Order Balance</value>
         <variableId>178f2d28-da65-45e8-8ba9-649d88b77fd9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Forms Being Tracked</value>
         <variableId>53cc53b6-a6d6-4a38-9b33-7725278ff895</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId></testDataLinkId>
         <type>DEFAULT</type>
         <value></value>
         <variableId>65e95e51-1f91-4979-8eb4-48f26768f8b3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Hold</value>
         <variableId>dca60244-2f53-4f5d-ba7e-52eefef1f4a6</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Billing Hold Reason</value>
         <variableId>84157438-1d4f-4c07-899a-5193db155990</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Stop Bill Date Only</value>
         <variableId>55344987-2b1d-4f95-96b8-229045dfc5b0</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>CutoffDate</value>
         <variableId>21d4a964-3a54-4bf3-8574-a59989a0e446</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>Last Bill Date</value>
         <variableId>218742d7-cb83-4c77-b9d4-6aad59e7b8ba</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>NoLastBillDateOnly</value>
         <variableId>9c0206f6-d110-4ed2-afd8-ad5b37c8a013</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>OrderSortedBy</value>
         <variableId>63ab07fb-735f-42eb-ab09-c21dcf053039</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>04a3948d-d34c-45d1-9a73-aabf8d8841fe</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>OrdersPerPage</value>
         <variableId>ebe2ebad-0f49-4f87-ad49-59e7d080c7f5</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
