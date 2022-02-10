insert into addresses (address_id, country, city, street)
values (1, 'Bulgaria', 'Sofia', 'Oborishte 25'),
       (2, 'United States', 'New York', 'Madison Avenue 383'),
       (3, 'Italy', 'Naples', 'Rue Di Capri 1000'),
       (4, 'United Kingdom', 'Manchester', 'Sir Matt Busby Way 16' ),
       (5, 'France', 'Bordeaux', 'Rue des Saints 75');

insert into students(user_id, first_name, last_name, age, hobby, address_id)
values (1, 'Chandler', 'Bing', 33, jokes, 1),
       (2, 'Hunter', 'Thompson', 56, journalism, 2),
       (3, 'James', 'Grant', 47, literature, 3),
       (4, 'Nelson', 'DeMille', 51, literature, 4),
       (5, 'Raymond', 'Chandler', 39, 'none', 5);
