package net.jeeshop.services.front.order.bean;import java.io.Serializable;import java.util.LinkedList;import java.util.List;import net.jeeshop.core.kuaidi.Kuaidi100Info;import net.jeeshop.services.front.orderdetail.bean.Orderdetail;import net.jeeshop.services.front.ordership.bean.Ordership;public class Order extends net.jeeshop.services.common.Order implements Serializable {	private static final long serialVersionUID = 1L;	private String picture;// 商品图片	/*	 * 查询我的订单列表,使用一条SQL完成,保存在下列属性中	 */	private int productID;// 商品ID	private int productNumber;// 商品数量	private double price;// 商品单价金额	private String productName;// 商品名称.取自订单项表	private String orderdetailID;//订单项ID	private String isComment;//是否评价过。n:未评价,y:已评价；默认		private List<String> queryOrderIDs;// 查询订单的ID集合	private List<Order> orders;// 订单对象的订单明细信息,但是此信息都是用Order对象存储的,因为ibaties查询出来的数据只能放到一个对象中,暂时就放在了订单对象中	private List<Orderdetail> orderdetail;// 订单明细集合	private Ordership ordership;//订单配送信息	private Kuaidi100Info kuaid100Info;//订单明细--快递信息//	private Orderpay orderpay;//支付记录	private String orderpayID;//支付记录ID	private String tradeNo;//支付宝交易号	private String selectAddressID;//选中的收货地址的ID//	private String wIDsubject;//订单支付时候显示的文字		private List<Orderdetail> rateOrderdetailList;//可以进行评论的商品列表	public Order() {		//System.out.println("...init..order.."+this.toString());	}	public void clear() {		super.clear();		picture = null;		productID = 0;		productNumber = 0;		price = 0;		productName = null;		isComment = null;		orderdetailID = null;		if (orderdetail != null) {			orderdetail.clear();		}		orderdetail = null;		if (orders != null) {			orders.clear();		}		orders = null;		if (queryOrderIDs != null) {			queryOrderIDs.clear();		}		queryOrderIDs = null;				if(ordership!=null){			ordership.clear();			ordership = null;		}		if(kuaid100Info!=null){			kuaid100Info.clear();			kuaid100Info = null;		}		orderpayID = null;		tradeNo = null;		selectAddressID = null;				if(rateOrderdetailList!=null){			rateOrderdetailList.clear();			rateOrderdetailList = null;		}	}	public List<Orderdetail> getOrderdetail() {		return orderdetail;	}	public void setOrderdetail(List<Orderdetail> orderdetail) {		this.orderdetail = orderdetail;	}	public int getProductNumber() {		return productNumber;	}	public void setProductNumber(int productNumber) {		this.productNumber = productNumber;	}	public double getPrice() {		return price;	}	public void setPrice(double price) {		this.price = price;	}	public String getProductName() {		return productName;	}	public void setProductName(String productName) {		this.productName = productName;	}	public List<Order> getOrders() {		if (this.orders == null) {			this.orders = new LinkedList<Order>();		}		return orders;	}	public void setOrders(List<Order> orders) {		this.orders = orders;	}	public List<String> getQueryOrderIDs() {		return queryOrderIDs;	}	public void setQueryOrderIDs(List<String> queryOrderIDs) {		this.queryOrderIDs = queryOrderIDs;	}	public int getProductID() {		return productID;	}	public void setProductID(int productID) {		this.productID = productID;	}	public String getPicture() {		return picture;	}	public void setPicture(String picture) {		this.picture = picture;	}	public String getIsComment() {		return isComment;	}	public void setIsComment(String isComment) {		this.isComment = isComment;	}	public String getOrderdetailID() {		return orderdetailID;	}	public void setOrderdetailID(String orderdetailID) {		this.orderdetailID = orderdetailID;	}	public Ordership getOrdership() {		return ordership;	}	public void setOrdership(Ordership ordership) {		this.ordership = ordership;	}	public Kuaidi100Info getKuaid100Info() {		return kuaid100Info;	}	public void setKuaid100Info(Kuaidi100Info kuaid100Info) {		this.kuaid100Info = kuaid100Info;	}	public String getOrderpayID() {		return orderpayID;	}	public void setOrderpayID(String orderpayID) {		this.orderpayID = orderpayID;	}	public String getTradeNo() {		return tradeNo;	}	public void setTradeNo(String tradeNo) {		this.tradeNo = tradeNo;	}	public String getSelectAddressID() {		return selectAddressID;	}	public void setSelectAddressID(String selectAddressID) {		this.selectAddressID = selectAddressID;	}	public List<Orderdetail> getRateOrderdetailList() {		return rateOrderdetailList;	}	public void setRateOrderdetailList(List<Orderdetail> rateOrderdetailList) {		this.rateOrderdetailList = rateOrderdetailList;	}}