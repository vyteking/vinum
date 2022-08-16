CREATE TABLE vinumMember(
	memberId VARCHAR2(32) PRIMARY KEY,
	memberPassword VARCHAR2(32) NOT NULL,
	memberNickName VARCHAR2(32) NOT NULL,
	memberEmail VARCHAR2(64), 
	mmeberPhone VARCHAR2(16)
)