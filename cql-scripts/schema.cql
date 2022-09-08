// Create key space
CREATE KEYSPACE user_key_space_test WITH replication = {'class': 'SimpleStrategy', 'replication_factor':1};

// Create table under key space
CREATE TABLE IF NOT EXISTS user_key_space.user(USERID text, PROFILEID text, NAME text, ADDRESS text, PRIMARY KEY(USERID));
