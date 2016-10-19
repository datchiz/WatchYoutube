package com.example.mypc.watchyoutube.objectofplaylist;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class PlayList {

@SerializedName("kind")
@Expose
private String kind;
@SerializedName("etag")
@Expose
private String etag;
@SerializedName("pageInfo")
@Expose
private PageInfo pageInfo;
@SerializedName("items")
@Expose
private List<Item> items = new ArrayList<Item>();

/**
* 
* @return
* The kind
*/
public String getKind() {
return kind;
}

/**
* 
* @param kind
* The kind
*/
public void setKind(String kind) {
this.kind = kind;
}

/**
* 
* @return
* The etag
*/
public String getEtag() {
return etag;
}

/**
* 
* @param etag
* The etag
*/
public void setEtag(String etag) {
this.etag = etag;
}

/**
* 
* @return
* The pageInfo
*/
public PageInfo getPageInfo() {
return pageInfo;
}

/**
* 
* @param pageInfo
* The pageInfo
*/
public void setPageInfo(PageInfo pageInfo) {
this.pageInfo = pageInfo;
}

/**
* 
* @return
* The items
*/
public List<Item> getItems() {
return items;
}

/**
* 
* @param items
* The items
*/
public void setItems(List<Item> items) {
this.items = items;
}

}