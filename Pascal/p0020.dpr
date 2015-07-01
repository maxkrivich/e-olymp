program p20;
{$APPTYPE CONSOLE}
uses
  SysUtils;

var
  n, cnt, m: longint;
  sum: integer;
begin
  readln(n);
  cnt := 0;
  while n > 0 do
  begin
    sum := 0;
    m := n;
    while m > 0 do
    begin
      sum := sum + m mod 10;
      m := m div 10;
    end;
    n := n - sum;
    inc(cnt);
  end;
  writeln(cnt);
end. 
