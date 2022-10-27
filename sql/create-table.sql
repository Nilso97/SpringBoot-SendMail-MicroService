-- Table: tb_email

-- DROP TABLE tb_email;

CREATE TABLE tb_email
(
  email_id bigint NOT NULL,
  email_from character varying(255),
  email_to character varying(255),
  owner_ref character varying(255),
  send_date_email timestamp without time zone,
  status_email integer,
  subject character varying(255),
  text text,
  CONSTRAINT tb_email_pkey PRIMARY KEY (email_id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE tb_email
  OWNER TO postgres;
