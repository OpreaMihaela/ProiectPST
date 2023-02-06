-- ----------------------------------------------------
-- Table `CLIENTI`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `FARMACIE`.`clienti`;


CREATE TABLE IF NOT EXISTS `FARMACIE`.`clienti` (
  `clienti_id` INT NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `nr_tel` VARCHAR(255) NOT NULL,
  `nume` VARCHAR(255) NOT NULL,
  `prenume` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`clienti_id`)
  ) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


LOCK TABLES `FARMACIE`.`clienti` WRITE;
INSERT INTO `FARMACIE`.clienti` VALUES (1,'emailT1@yahoo.com','07xxxxxxxx','numeT1','prenumeT1'),(2,'emailT2@yahoo.com','07xxxxxxxx','numeT2','prenumeT2');
UNLOCK TABLES;



-- -----------------------------------------------------
-- Table `PRODUSE`
-- -----------------------------------------------------

DROP TABLE IF EXISTS `FARMACIE`.`produse`;

CREATE TABLE IF NOT EXISTS `FARMACIE`.`produse` (
  `produse_id` INT NOT NULL,
  `denumire` VARCHAR(255) NOT NULL,
  `pret` FLOAT NOT NULL,
  `tip_produs` VARCHAR(255) NULL,
  `clienti_id` INT(11) NOT NULL,
  PRIMARY KEY (`produse_id`),
  CONSTRAINT `clienti_id`
    FOREIGN KEY (`clienti_id`)
    REFERENCES `FARMACIE`.`clienti` (`clienti_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

LOCK TABLES `FARMACIE`.`produse` WRITE;
INSERT INTO `FARMACIE`.`produse` VALUES (1,'denumire1',000.00,'tip1',1),(2,'denumire2',000.00,'tip2',1),(3,'denumire3',000.00,'tip3',2);
UNLOCK TABLES;

-- -----------------------------------------------------
-- Table `STOCUL`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `FARMACIE`.`stocul`;

CREATE TABLE IF NOT EXISTS `FARMACIE`.`stocul` (
  `stocul_id` INT NOT NULL,
  `nr_produse` INT NOT NULL,
  `produse_id` INT DEFAULT NULL,
  PRIMARY KEY (`stocul_id`),
  CONSTRAINT `produse_id`
    FOREIGN KEY (`produse_id`)
    REFERENCES `FARMACIE`.`stocul` (`stocul_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;


LOCK TABLES `FARMACIE`.`stocul` WRITE;
INSERT INTO `FARMACIE`.`stocul` VALUES (1,10,1),(2,10,2),(3,10,3);
UNLOCK TABLES;
