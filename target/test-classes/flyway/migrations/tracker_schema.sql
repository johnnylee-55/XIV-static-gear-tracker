DROP TABLE IF EXISTS equipped_gear;
DROP TABLE IF EXISTS gear;
DROP TABLE IF EXISTS static_composition;
DROP TABLE IF EXISTS player_character;
DROP TABLE IF EXISTS raiding_static;

CREATE TABLE raiding_static (
	static_id INT AUTO_INCREMENT NOT NULL,
	static_name VARCHAR(64),
	PRIMARY KEY (static_id)
);

CREATE TABLE player_character (
	character_id INT AUTO_INCREMENT NOT NULL,
	character_name VARCHAR(64) NOT NULL,
	job ENUM ("PLD","WAR","DRK","GNB",
				"SGE","SCH","AST","WHM",
				"MNK","RPR","SAM","NIN","DRG",
				"BRD","MCH","DNC",
				"BLM","RDM","SMN"),
	PRIMARY KEY (character_id)
);

CREATE TABLE static_composition (
	static_id INT NOT NULL,
	character_id INT,
	FOREIGN KEY (static_id) REFERENCES raiding_static (static_id) ON DELETE CASCADE,
	FOREIGN KEY (character_id) REFERENCES player_character (character_id) ON DELETE CASCADE
);

CREATE TABLE gear (
	gear_id INT AUTO_INCREMENT NOT NULL,
	gear_name VARCHAR(64) NOT NULL,
	gear_slot ENUM ("WEAPON","HEAD","CHEST","HANDS","LEGS","FEET",
					"EAR","NECK","WRIST","RING") NOT NULL,
	acquisition_info TEXT,
	PRIMARY KEY (gear_id)
);

CREATE TABLE equipped_gear (
	character_id INT NOT NULL,
	gear_id INT NOT NULL,
	FOREIGN KEY (character_id) REFERENCES player_character (character_id) ON DELETE CASCADE,
	FOREIGN KEY (gear_id) REFERENCES gear (gear_id) ON DELETE CASCADE
);
