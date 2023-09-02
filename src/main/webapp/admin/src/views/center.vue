<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
    >  
     <el-row>
                              <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="用户账号" prop="yonghuzhanghao">
          <el-input v-model="ruleForm.yonghuzhanghao" readonly              placeholder="用户账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="用户姓名" prop="yonghuxingming">
          <el-input v-model="ruleForm.yonghuxingming"               placeholder="用户姓名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item v-if="flag=='yonghu'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie" placeholder="请选择性别">
            <el-option
                v-for="(item,index) in yonghuxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="年龄" prop="nianling">
          <el-input v-model="ruleForm.nianling"               placeholder="年龄" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='yonghu'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="yonghutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='yonghu'"  label="用户手机" prop="yonghushouji">
          <el-input v-model="ruleForm.yonghushouji"               placeholder="用户手机" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                  <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="商家账号" prop="shangjiazhanghao">
          <el-input v-model="ruleForm.shangjiazhanghao" readonly              placeholder="商家账号" clearable></el-input>
        </el-form-item>
      </el-col>
                                          <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="店铺名" prop="dianpuming">
          <el-input v-model="ruleForm.dianpuming"               placeholder="店铺名" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="店铺地址" prop="dianpudizhi">
          <el-input v-model="ruleForm.dianpudizhi"               placeholder="店铺地址" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="联系方式" prop="lianxifangshi">
          <el-input v-model="ruleForm.lianxifangshi"               placeholder="联系方式" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="联系人" prop="lianxiren">
          <el-input v-model="ruleForm.lianxiren"               placeholder="联系人" clearable></el-input>
        </el-form-item>
      </el-col>
                        <el-col :span="24">  
        <el-form-item v-if="flag=='shangjia'" label="商家图片" prop="shangjiatupian">
          <file-upload
          tip="点击上传商家图片"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.shangjiatupian?ruleForm.shangjiatupian:''"
          @change="shangjiashangjiatupianUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
                        <el-col :span="12">
        <el-form-item   v-if="flag=='shangjia'"  label="经营范围" prop="jingyingfanwei">
          <el-input v-model="ruleForm.jingyingfanwei"               placeholder="经营范围" clearable></el-input>
        </el-form-item>
      </el-col>
                                                                                                                                                                                          <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
                                                                  yonghuxingbieOptions: [],
                                                                                                                                                                                                                                                                                                                                                    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
                                            this.yonghuxingbieOptions = "男,女".split(',')
                                                                                                                                                                                                                                  },
  methods: {
                                                                                                                                                                                                                                                                                                                                yonghutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
                                                                                                shangjiashangjiatupianUploadChange(fileUrls) {
        this.ruleForm.shangjiatupian = fileUrls;
    },
                                                                                                                            onUpdateHandler() {
                              if((!this.ruleForm.yonghuzhanghao)&& 'yonghu'==this.flag){
        this.$message.error('用户账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'yonghu'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                    if( 'yonghu' ==this.flag && this.ruleForm.nianling&&(!isIntNumer(this.ruleForm.nianling))){
       this.$message.error(`年龄应输入整数`);
        return
      }
                                                                                                                                          if( 'yonghu' ==this.flag && this.ruleForm.yonghushouji&&(!isMobile(this.ruleForm.yonghushouji))){
        this.$message.error(`用户手机应输入手机格式`);
        return
      }
                                                      if( 'yonghu' ==this.flag && this.ruleForm.money&&(!isNumber(this.ruleForm.money))){
        this.$message.error(`余额应输入数字`);
        return
      }
                                                                              if((!this.ruleForm.shangjiazhanghao)&& 'shangjia'==this.flag){
        this.$message.error('商家账号不能为空');
        return
      }
                                                                  if((!this.ruleForm.mima)&& 'shangjia'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if( 'shangjia' ==this.flag && this.ruleForm.money&&(!isNumber(this.ruleForm.money))){
        this.$message.error(`余额应输入数字`);
        return
      }
                                                                                                                                                                                    this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
