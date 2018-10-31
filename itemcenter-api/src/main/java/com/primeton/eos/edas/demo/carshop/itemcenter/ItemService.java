package com.primeton.eos.edas.demo.carshop.itemcenter;

/**
 * Alibaba Group EDAS. http://www.aliyun.com/product/edas
 */
public interface ItemService {

	public Item getItemById( long id );
	
	public Item getItemByName( String name );
	
}
