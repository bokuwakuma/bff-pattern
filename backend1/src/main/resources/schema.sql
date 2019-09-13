DROP TABLE card IF EXISTS;
DROP TABLE member IF EXISTS;

CREATE TABLE member (
    -- ユーザID
    user_id VARCHAR(10) NOT NULL,
    -- 名
    first_name VARCHAR(30),
    -- 姓
    last_name VARCHAR(30),
    -- 作成日時
    created_at TIMESTAMP,
    -- 更新日時
    last_updated_at TIMESTAMP,
    PRIMARY KEY (user_id)
);

CREATE TABLE card (
    -- カード番号
    personal_card_no VARCHAR(16) NOT_NULL,
    -- カード種別
    admission_code VARCHAR(2),
    -- メインカード
    main BOOLEAN,
    -- ユーザID
    user_id VARCHAR(10) NOT NULL,
    -- 作成日時
    created_at TIMESTAMP,
    -- 更新日時
    last_updated_at TIMESTAMP,
    PRIMARY KEY (personal_card_no)
);

/* マスタ */
CREATE TABLE mst_admission_code (
    -- カード種別
    admisson_code VARCHAR(2) NOT NULL,
    -- カード名称
    admission_name VARCHAR(50),
    PRIMARY KEY (admission_code)
);

ALTER TABLE card
    ADD FOREIGN KEY (member_id)
    REFERENCES member (member_id)
    ON UPDATE RESTRICT
    ON DELETE RESTRICT
;