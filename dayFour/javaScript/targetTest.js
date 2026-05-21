const { array } = require('./target'); 

test('should correctly output positive numbers', () => {
   array1= [8,-2,4]
    expect(array(array1,6)).toBe([8,-2]);
  });
