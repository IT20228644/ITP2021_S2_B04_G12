window.addEventListener('load',()=> {
    let params=(new URL(document.location)).searchParams;
    const itemName=params.get('itemName');
    const unitePrice=params.get('unitePrice');

    document.getElementById('res-itemName').innerHTML=itemName;
    document.getElementById('res-unitPrice').innerHTML=unitePrice;

})