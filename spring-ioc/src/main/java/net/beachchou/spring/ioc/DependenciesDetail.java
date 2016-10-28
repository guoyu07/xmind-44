/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.beachchou.spring.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 *
 * @author beach
 */
public class DependenciesDetail {

    private boolean bool;
    private byte b;
    private char ch;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private String str;
    private Properties p;
    private List list;
    private Map map;
    private Set set;

    public DependenciesDetail() {
    }

    public DependenciesDetail(int i, String str) {
        this.i = i;
        this.str = str;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public boolean isBool() {
        return bool;
    }

    public void setBool(boolean bool) {
        this.bool = bool;
    }

    public byte getB() {
        return b;
    }

    public void setB(byte b) {
        this.b = b;
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    public short getS() {
        return s;
    }

    public void setS(short s) {
        this.s = s;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public long getL() {
        return l;
    }

    public void setL(long l) {
        this.l = l;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

}
