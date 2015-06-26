program p494;
{$APPTYPE CONSOLE}

uses
  SysUtils;

var
  s: set of char;
  str:string;
  i,cnt:Integer;
begin
  cnt:=0;
  s:=['A', 'E', 'I', 'O', 'U' , 'Y'];
  Readln(str);
  Str:=AnsiUpperCase(str);
  for i:=1 to Length(str) do
   if str[i] in s then
   Inc(cnt);
   Writeln(cnt);
end.
