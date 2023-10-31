INSERT INTO users
(username, "password", enabled)
VALUES('phisher', '$2a$12$ZLCj2JSZyBGGsMhK8FXkQeG7VMzPsqrJTUU61NcCBj1Poqmyse5Cy', true) ON CONFLICT DO NOTHING;