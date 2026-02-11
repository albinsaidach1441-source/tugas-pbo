
 CREATE DATABASE db_login;

\c db_login;

CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL
);

-- Bulk insert (30 contoh akun)
INSERT INTO users (username, password) VALUES
('mahasiswa', 'pbo2025'),
('fauzi', 'lumajang01'),
('siti', 'belajar123'),
('budi', 'password1'),
('ani', 'qwerty123'),
('dedi', 'welcome2025'),
('rita', 'kopi123'),
('agus', 'rahasia'),
('lina', 'halo2025'),
('wahyu', 'ojol2025'),
('eka', 'sains99'),
('tono', 'ganteng01'),
('rina', 'cantik02'),
('ari', 'koding123'),
('nina', 'guru123'),
('yudi', 'belajar456'),
('maya', 'pbo2024'),
('eko', 'dbadmin'),
('putri', 'devops01'),
('irma', 'testing'),
('sani', 'helloWorld'),
('dian', 'linux123'),
('ilham', 'nodejs2025'),
('rafi', 'react123'),
('salsa', 'uiux2025'),
('omar', 'java456'),
('lutfy', 'php2026'),
('kevin', 'sqlmaster'),
('ayu', 'frontend');

-- Tampilkan semua data
SELECT * FROM users;

