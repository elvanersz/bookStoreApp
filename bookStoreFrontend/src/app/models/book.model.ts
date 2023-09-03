export class book{
  id: number |undefined;
  title: string = "";
  author: string = "";
  price: number = 0;
  description: string = "";
  createTime: Date = new Date();

  constructor(id?: number, title: string = "", price: number = 0) {
    this.id = id;
    this.title = title;
    this.price = price;
  }
}
