-- Analysis data --
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '7ed1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 1', 3, 2, 'USER');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '6re1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 2', 3, 2, 'USER');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '8gh1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 3', 1, 2, 'USER');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '9th1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 4', 2, 2, 'SCHEDULED_UPDATE');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '5gh1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 5', 1, 2, 'SCHEDULED_UPDATE');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '2bv1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 6', 2, 4, 'USER');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '7hb1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 7', 2, 3, 'USER');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '5hg1f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 8', 1, 1, 'SCHEDULED_UPDATE');
INSERT INTO ANALYSIS (ID, NAME, INSTANCES_COUNT, USER_COUNT, ORIGINATOR)  VALUES ( '1871f811-19f6-f4ac-c985-3da501193f54', 'Test Analysis 9', 0, 0, null);

-- Service instances data --
INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS) VALUES ( 'e469c007-a267-42df-93bb-be7e63f6196a', 'a0c81463-a9d1-455d-a221-ec76d24c145c', 'RUNNING', 'Instance1', 12.45, 234.34, 2);

-- Analysis routing data --
INSERT INTO ANALYSIS_ROUTING (ANALYSIS_ID, SERVICE_ID) VALUES ('7ed1f811-19f6-f4ac-c985-3da501193f54', 'e469c007-a267-42df-93bb-be7e63f6196a');

-- Nodes data --
INSERT INTO NODES (ID, NAME, ONLINE_STATUS, CPU_USAGE, MEMORY_AVAILABLE) VALUES ('a0c81463-a9d1-455d-a221-ec76d24c145c', 'NODE1', true, 10.45, 80);

-- Communication data --
INSERT INTO COMMUNICATION (FROM_ID, TO_ID, CAN_COMMUNICATE , MESSAGE, LAST_MODIFIED) VALUES ('a0c81463-a9d1-455d-a221-ec76d24c145c', 'e469c007-a267-42df-93bb-be7e63f6196a', true, null, '2017-06-15 06:20:28');

-- Notification data --
INSERT INTO NOTIFICATION (TYPE, LEVEL, MESSAGE, TIME_STAMP) VALUES ('NODES', 'WARNING', 'The node manager sf-seaanjana2.sea.qclab.test is offline. ID: 3f7b4626-2ccd-40a1-acd6-72dec114c227', '2017-06-12 06:20:28');


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS) 
VALUES ( 'd79c007-a267-42df-93bb-be7e63f6196a', 'a0c81463-a9d1-455d-a221-ec76d24c145c', 'RUNNING', 'Instance1', 12.45, 10.5, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( '61cd1bea-c3a9-40e5-9914-d86d6dc066cf', 'a0c81463-a9d1-455d-a221-ec76d24c145c', 'RUNNING', 'Instance2', 3.45, 9.7, 3
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( 'd565w007-a267-42df-93bb-be7e63f6196a', 'a0c81463-a9d1-455d-a221-ec76d24c145c', 'STOPPED', 'Instance3', 89.45, 20.34, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( '6ff15a47-097f-44a3-8b30-5c608501b886', '1e7bb257-5cb7-4a0b-bb07-7f6aa5e414d1', 'RUNNING', 'Instance5', 92.25, 17.34, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( '8dd15a47-097f-84a3-8c30-23468501b886', '1e7bb257-5cb7-4a0b-bb07-7f6aa5e414d1', 'FAILED', 'Instance6', 0.75, 30.34, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( 're49c007-a267-42df-93bb-be7e63f6196a', '3f7b4626-2ccd-40a1-acd6-72dec114c227', 'STOPPED', 'Instance7', 73.75, 60.05, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( 'c29c143e-5448-41ad-9a57-33b1b427c570', '3f7b4626-2ccd-40a1-acd6-72dec114c227', 'RUNNING', 'Instance8', 14.05, 20.34, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( 'were1434-5448-41ad-9a57-33b1b427c570', 'eb8ef2d4-b1f3-4e11-b930-ff3275bc8e04', 'RUNNING', 'Instance9', 12.45, 23.34, 2
);


INSERT INTO SERVICE_INSTANCES (ID, NODE_ID, STATUS, NAME, CPU_USAGE, MEMORY_USAGE, USERS)
VALUES ( 'sushc07d-a267-42df-93bb-be7e63f6196a', 'eb8ef2d4-b1f3-4e11-b930-ff3275bc8e04', 'RUNNING', 'Instance10', 12.45, 45.34, 2
);


INSERT INTO NODES (ID, NAME, ONLINE_STATUS, CPU_USAGE, MEMORY_AVAILABLE) 
VALUES ('1e7bb257-5cb7-4a0b-bb07-7f6aa5e414d1', 'NODE2', true, 30.45, 70
);

INSERT INTO NODES (ID, NAME, ONLINE_STATUS, CPU_USAGE, MEMORY_AVAILABLE) 
VALUES ('3f7b4626-2ccd-40a1-acd6-72dec114c227', 'NODE3', true, 66.66, 30
);


INSERT INTO NODES (ID, NAME, ONLINE_STATUS, CPU_USAGE, MEMORY_AVAILABLE) 
VALUES ('eb8ef2d4-b1f3-4e11-b930-ff3275bc8e04', 'NODE4', true, 5.66, 90
);