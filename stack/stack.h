typedef int ItemType;
const int max_items = 100;

class Stack {

	private:
		int size;
		ItemType* structure;
		
	public:
		Stack(); // constructor
		~Stack(); // destructor
		bool isFull();
		bool isEmpty();
		void push(ItemType item);
		ItemType pop();
		void print();
		int length();
		ItemType peek();
};
