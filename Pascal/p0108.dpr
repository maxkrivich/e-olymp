program p108;
{$APPTYPE CONSOLE}
uses
  SysUtils;

var
  M: array[1..3] of Integer;
  i, j, tmp: Integer;
begin
  Read(M[1], M[2], M[3]);
  for i := 3 - 1 downto 1 do
    for j := 1 to i do
      if M[j] > M[j + 1] then
      begin
        tmp := M[j];
        M[j] := M[j + 1];
        M[j + 1] := tmp;
      end;
  Writeln(M[2]);
end.
 
