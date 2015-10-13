program p2614;
{$APPTYPE CONSOLE}
uses SysUtils;

var
  n, i, num, cnt: Integer;

begin
  Readln(n);
  num := 1;
  i := 1;
  cnt := 0;
  while (i <= n) do
  begin
    write(num, ' ');
    Inc(cnt);
    if (num = cnt) then
    begin
      Inc(num);
      cnt := 0;
    end;
    Inc(i);
  end;
  writeln;
end.
