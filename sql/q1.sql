SELECT name FROM member WHERE id IN
(
  SELECT member_id FROM checkout_item
  WHERE book_id = 5
);
