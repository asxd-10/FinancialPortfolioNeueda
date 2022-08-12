create schema InvestorsDB;
use InvestorsDB;
select * from stock;


select count(*) from stock;

alter table stock 
rename column Symbol to symbol,
rename column `Open` to `open`,
rename column High to high,
rename column Low to low,
rename column LTP to ltp,
rename column Chng to `change`,
rename column `% Chng` to percent_change,
rename column `Volume (lacs)` to volume,
rename column `Turnover (crs.)` to turnover,
rename column `52w H` to week_high_52,
rename column `52w L` to  week_low_52;

alter table stock 
rename column `365 d % chng` to annual_pct_change,
rename column `30 d % chng` to monthly_pct_change;

alter table stock drop column id;
alter table stock drop column name;
alter table stock drop column close;

ALTER TABLE stock
  ADD id INT AUTO_INCREMENT NOT NULL PRIMARY KEY;

ALTER TABLE investor
  MODIFY id INT AUTO_INCREMENT;

ALTER TABLE stock
rename column `change` to changes,
rename column `open` to openv;

select * from stock;
insert into Investor (buying_price, p_or_l, quantity, selling_price, stock_id) values (100, 10, 5, 200, 2);