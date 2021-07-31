INSERT INTO book_details(id, isbn, lang, publisher) VALUES
    (1, '0001', 'EN', 'WhiteBook'),
    (2, '0002', 'EN', 'BlackBook'),
    (3, '0003', 'EN', 'BlueBook')
;

INSERT INTO book (id, title, author, details_id) VALUES
    (1, 'The Lord Of The Rings', 'J.R.R. Tolkien', 1),
    (2, '1984', 'George Orwell', 2),
    (3, 'The Hitchhikers Guide To The Galaxy', 'Douglas Adams', 3)
;
