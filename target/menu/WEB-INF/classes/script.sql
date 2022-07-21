CREATE TABLE public."product"
(
    product_id   bigserial,
    name         character,
    price        double precision,
    descriptions character,
    PRIMARY KEY (product_id)
);

ALTER TABLE IF EXISTS public.product
    OWNER to postgres;


CREATE TABLE public."order"
(
    id_order    bigserial NOT NULL,
    name_order  character,
    table_order bigint,
    price_order bigint,
    PRIMARY KEY (id_order)
);

ALTER TABLE IF EXISTS public."order"
    OWNER to postgres;