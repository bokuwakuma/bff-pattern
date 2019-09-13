INSERT INTO member VALUES ('E000000001', 'Taro', 'Yamada', current_timestamp, current_timestamp);
INSERT INTO member VALUES ('E000000002', '太郎', '山田', current_timestamp, current_timestamp);
INSERT INTO member VALUES ('E000000003', 'たろう', 'やまだ', current_timestamp, current_timestamp);

INSERT INTO card VALUES ('123456789012', '01', 'E000000001', current_timestamp, current_timestamp);
INSERT INTO card VALUES ('234567890123', '02', 'E000000002', current_timestamp, current_timestamp);
INSERT INTO card VALUES ('345678901234', '03', 'E000000003', current_timestamp, current_timestamp);

INSERT INTO mst_admission_code VALUES ('01', 'クレジットカード');
INSERT INTO mst_admission_code VALUES ('02', 'デビットカード');
INSERT INTO mst_admission_code VALUES ('03', 'ポイントカード');
