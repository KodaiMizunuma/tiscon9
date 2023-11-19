package com.tiscon.form;

import com.tiscon.validator.Numeric;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 顧客が入力する見積もり情報を保持するクラス。
 *
 * @author Oikawa Yumi
 */
public class UserOrderForm {

    @NotBlank(message = "名前が入力されていません")
    private String customerName;

    @NotBlank(message = "電話番号が入力されていません")
    @Numeric(message = "電話番号が半角数字で入力されていません")
    private String tel;

    @Email(message = "メールアドレス形式ではありません")
    @NotBlank(message = "メールアドレスが入力されていません")
    private String email;

    @NotBlank(message = "集荷元住所（都道府県）が入力されていません")
    private String oldPrefectureId;

    @NotBlank(message = "集荷元住所（市区町村以下）が入力されていません")
    private String oldAddress;

    @NotBlank(message = "お届け先住所（都道府県）が入力されていません")
    private String newPrefectureId;

    @NotBlank(message = "お届け先住所（市区町村以下）が入力されていません")
    private String newAddress;

    @Numeric(message = "段ボールの個数が半角数字で入力されていません")
    @NotBlank(message = "段ボールの個数が入力されていません")
    private String box;

    @Numeric(message = "ベッドの個数が半角数字で入力されていません")
    @NotBlank(message = "ベッドの個数が入力されていません")
    private String bed;

    @Numeric(message = "自転車の個数が半角数字で入力されていません")
    @NotBlank(message = "自転車の個数が入力されていません")
    private String bicycle;

    @Numeric(message = "洗濯機の個数が半角数字で入力されていません")
    @NotBlank(message = "洗濯機の個数が入力されていません")
    private String washingMachine;

    @NotNull
    private boolean washingMachineInstallation;

    @NotBlank(message = "郵便番号が入力されていません")
    @Size(min = 8, max=8, message = "有効な郵便番号を入力してください")
    private String postcode;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getBicycle() {
        return bicycle;
    }

    public void setBicycle(String bicycle) {
        this.bicycle = bicycle;
    }

    public String getWashingMachine() {
        return washingMachine;
    }

    public void setWashingMachine(String washingMachine) {
        this.washingMachine = washingMachine;
    }

    public boolean getWashingMachineInstallation() {
        return washingMachineInstallation;
    }

    public void setWashingMachineInstallation(boolean washingMachineInstallation) {
        this.washingMachineInstallation = washingMachineInstallation;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
}
