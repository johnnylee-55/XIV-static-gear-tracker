-- Insert into static table
INSERT INTO raiding_static (static_name) VALUES ('AndyAbyssos');
INSERT INTO raiding_static (static_name) VALUES ('Scions of the Seventh Dawn');

-- Insert into character table
INSERT INTO player_character (character_name, job) VALUES ('Ceres Fauna', 'DRK');
INSERT INTO player_character (character_name, job) VALUES ('Sohn Emiya', 'GNB');
INSERT INTO player_character (character_name, job) VALUES ('Ninomae Ina''nis', 'SCH');
INSERT INTO player_character (character_name, job) VALUES ('Katagiri Yuichi', 'SGE');
INSERT INTO player_character (character_name, job) VALUES ('Mango M''ochi', 'NIN');
INSERT INTO player_character (character_name, job) VALUES ('Houshou Marine', 'DRG');
INSERT INTO player_character (character_name, job) VALUES ('Alterna Pendragon', 'DNC');
INSERT INTO player_character (character_name, job) VALUES ('Darragh Ironclancy', 'RDM');

INSERT INTO player_character (character_name, job) VALUES ('Thancred Waters', 'GNB');
INSERT INTO player_character (character_name, job) VALUES ('Warrior of Light', 'PLD');
INSERT INTO player_character (character_name, job) VALUES ('Urianger Augurelt', 'AST');
INSERT INTO player_character (character_name, job) VALUES ('Alphinaud Leveilleur', 'SGE');
INSERT INTO player_character (character_name, job) VALUES ('Y''shtola', 'BLM');
INSERT INTO player_character (character_name, job) VALUES ('Estinien Wyrmblood', 'DRG');
INSERT INTO player_character (character_name, job) VALUES ('Alisaie Leveilleur', 'RDM');
INSERT INTO player_character (character_name, job) VALUES ('G''raha Tia', 'BLM');

-- Insert into gear table
INSERT INTO gear (gear_name, gear_slot, acquisition_info) VALUES ('Abyssos Cleavers', 'WEAPON', 'P8S');
INSERT INTO gear (gear_name, gear_slot, acquisition_info) VALUES ('Abyssos Coat Fending', 'CHEST', 'P8S');
INSERT INTO gear (gear_name, gear_slot, acquisition_info) VALUES ('Augmented Lunar Envoys Leggings of Aiming', 'LEGS', 'Tome gear. Upgrade twine from P7S');

-- AndyAbyssos
INSERT INTO static_composition (static_id, character_id) VALUES (1, 1);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 2);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 3);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 4);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 5);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 6);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 7);
INSERT INTO static_composition (static_id, character_id) VALUES (1, 8);

-- AndyAbyssos Gear
INSERT INTO equipped_gear (character_id, gear_id) VALUES (5, 1);
INSERT INTO equipped_gear (character_id, gear_id) VALUES (2, 2);
INSERT INTO equipped_gear (character_id, gear_id) VALUES (7, 3);

-- Scions of the Seventh Dawn
INSERT INTO static_composition (static_id, character_id) VALUES (2, 9);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 10);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 11);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 12);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 13);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 14);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 15);
INSERT INTO static_composition (static_id, character_id) VALUES (2, 16);