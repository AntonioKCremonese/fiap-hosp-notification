CREATE TABLE notification (
    id CHAR(36) NOT NULL PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    message VARCHAR(2000) NOT NULL,
    user_email VARCHAR(200) NOT NULL,
    user_id VARCHAR(36) NOT NULL
);