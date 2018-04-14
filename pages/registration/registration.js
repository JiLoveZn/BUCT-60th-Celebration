// pages/registration/registration.js
Page({

  /**
   * 页面的初始数据
   */
  data: {
    date: '1958',
    school: ['无机系','有机系','化工系',],
    objectArray: [
      {
        id: 0,
        name: '无机系'
      },
      {
        id: 1,
        name: '有机系'
      },
      {
        id: 2,
        name: '化工系'
      },
    ],
    class_number: ['无机5801', '无机5802', '化工5805',],
    objectArray: [
      {
        id: 0,
        name: '无机5801'
      },
      {
        id: 1,
        name: '无机5802'
      },
      {
        id: 2,
        name: '化工5805'
      },
    ],
    index_1: 0,
    index_2: 0,
    enroll_time: '入学年份',
    school_name: '所在院系',
    class_name: '所在班级',
    name: '姓名',
    photo: '照片',
    finish: '完成注册',
  },
  formSubmit: function (e) {
    wx.navigateTo({
      url: '../first_page/first_page',
    });
    console.log('form发生了submit事件，携带数据为：', e.detail.value)
  },
  
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  },
  bindDateChange: function (e) {
    console.log('选择了'+e.detail.value);
    this.setData({
      date: e.detail.value
    })
  },
  bindSchoolChange: function (e) {
    console.log('index_1选择了' + e.detail.value);
    this.setData({
      index_1: e.detail.value
    })
  },
  bindClassChange: function (e) {
    console.log('index_2选择了' + e.detail.value);
    this.setData({
      index_2: e.detail.value
    })
  },
})