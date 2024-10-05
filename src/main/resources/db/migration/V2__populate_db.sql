INSERT INTO client (name) VALUES
    ('Client 1'),
    ('Client 2'),
    ('Client 3'),
    ('Client 4'),
    ('Client 5'),
    ('Client 6'),
    ('Client 7'),
    ('Client 8'),
    ('Client 9'),
    ('Client 10');

INSERT INTO planet (id, name) VALUES
    ('MARS', 'Mars'),
    ('VEN', 'Venus'),
    ('MER', 'Mercury'),
    ('JUP', 'Jupiter'),
    ('SAT', 'Saturn');

INSERT INTO ticket (client_id, from_planet_id, to_planet_id) VALUES
    (1, 'MARS', 'VEN'),
    (2, 'VEN', 'MARS'),
    (3, 'MER', 'JUP'),
    (4, 'SAT', 'MARS'),
    (5, 'MARS', 'MER'),
    (6, 'JUP', 'VEN'),
    (7, 'SAT', 'JUP'),
    (8, 'MARS', 'SAT'),
    (9, 'VEN', 'SAT'),
    (10, 'MER', 'SAT');
