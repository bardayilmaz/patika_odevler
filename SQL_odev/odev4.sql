-- 1. film tablosunda bulunan replacement_cost sütununda bulunan birbirinden farklı değerleri sıralayınız.
-- 2. film tablosunda bulunan replacement_cost sütununda birbirinden farklı kaç tane veri vardır?
-- 3. film tablosunda bulunan film isimlerinde (title) kaç tanesini T karakteri ile başlar ve aynı zamanda rating 'G' ye eşittir?
-- 4. country tablosunda bulunan ülke isimlerinden (country) kaç tanesi 5 karakterden oluşmaktadır?
-- 5. city tablosundaki şehir isimlerinin kaç tanesi 'R' veya r karakteri ile biter?

-- sorgu 1
--select distinct replacement_cost from film;

-- sorgu 2
--select count(distinct replacement_cost) from film;

-- sorgu 3
--select count(*) from film where title like 'T%' and rating = 'G';

-- sorgu 4
--select count(*) from country where country like '_____';

-- sorgu 5
--select count(*) from city where city ilike '%r';