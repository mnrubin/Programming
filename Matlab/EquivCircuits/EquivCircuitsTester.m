disp('test runs:');

X = [0 1; 1 0];
Y = [0 -1i; 1i 0];
Z = [1 0; 0 -1];
H = [1 1; 1 -1]/2^.5;
S = [1 0; 0 1i];
T = [1 0; 0 exp(1i*pi/4)];

% function [ gate ] = getGate( n )
%         n = mod(n, 6);
%         if n == 1
%             gate = X;
%         elseif n == 2
%             gate = Y;
%         elseif n == 3
%             gate = Z;
%         elseif n == 4
%             gate = H;
%         elseif n == 5
%             gate = S;
%         else  %if n == 0\6
%             gate = T;
%         end
% end

for n=1:6

    if n == 1
        disp('X');
        myGate = X;
    elseif n == 2
        disp('Y');
        myGate = Y;
    elseif n == 3
        disp('Z');
        myGate = Z;
    elseif n == 4
        disp('H');
        myGate = H;
    elseif n == 5
        disp('S');
        myGate = S;
    else  %if n == 0\6
        disp('T');
        myGate = T;
    end;
        
    a = myGate(1, 1);
    b = myGate(1, 2);
    c = myGate(2, 1);
    d = myGate(2, 2);

    EquivCircuits(a, b, c, d);
end


