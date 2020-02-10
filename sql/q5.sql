SELECT m.name,  quantitiy from 
member m JOIN
  (SELECT  member_id, count(*)  quantitiy FROM checkout_item
    GROUP BY member_id) c
      ON m.id = c.member_id
WHERE quantitiy >1
