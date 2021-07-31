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

INSERT INTO book_tag (id, book_id, value) VALUES
    (1, 1, 'lorem'),
    (2, 1, 'ipsum'),
    (3, 1, 'dolor'),
    (4, 1, 'consectetur'),
    (5, 2, 'adipiscing'),
    (6, 2, 'maximus'),
    (7, 2, 'semper'),
    (8, 3, 'adipiscing'),
    (9, 3, 'maximus')
;
