class Tiyaki {

    //コンストラクタ
    constructor(name) {
      this.name = name;
    }
    make(){
      console.log(`中身は${this.name}です。`);
    }
 }

    let annko = new Tiyaki('あんこ');
    let cream = new Tiyaki('クリーム');
    let cheese = new Tiyaki('チーズ');
    
    annko.make();
    cream.make();
    cheese.make();
   