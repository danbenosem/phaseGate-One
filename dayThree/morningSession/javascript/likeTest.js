const { Like } = require('./like'); 

test('that it brings correct output', () => {
   
    expect(Like("")).toBe("no one like this");
  });

