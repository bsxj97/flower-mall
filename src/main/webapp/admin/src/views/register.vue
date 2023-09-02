<template>
  <div>
    <div class="container">
      <div class="login-form" style="backgroundColor:rgba(208, 163, 140, 0.53);borderRadius:10px">
        <h1 class="h1" style="color:rgba(255, 255, 255, 1);fontSize:28px;">网上鲜花交易平台注册</h1>
		<el-form ref="rgsForm" class="rgs-form" :model="rgsForm" label-width="120px">
															<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">用户账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuzhanghao" class="input" type="text" placeholder="用户账号">
			   </div>
			 </div> -->
			<el-form-item label="用户账号" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.yonghuzhanghao" autocomplete="off" placeholder="用户账号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">用户姓名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghuxingming" class="input" type="text" placeholder="用户姓名">
			   </div>
			 </div> -->
			<el-form-item label="用户姓名" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.yonghuxingming" autocomplete="off" placeholder="用户姓名" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">年龄</div>
			   <div class="input-container">
			     <input v-model="ruleForm.nianling" class="input" type="text" placeholder="年龄">
			   </div>
			 </div> -->
			<el-form-item label="年龄" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.nianling" autocomplete="off" placeholder="年龄" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='yonghu'" class="input-group">
			   <div class="label">用户手机</div>
			   <div class="input-container">
			     <input v-model="ruleForm.yonghushouji" class="input" type="text" placeholder="用户手机">
			   </div>
			 </div> -->
			<el-form-item label="用户手机" class="input" v-if="tableName=='yonghu'">
			  <el-input v-model="ruleForm.yonghushouji" autocomplete="off" placeholder="用户手机" type="text" />
			</el-form-item>
																																	<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">商家账号</div>
			   <div class="input-container">
			     <input v-model="ruleForm.shangjiazhanghao" class="input" type="text" placeholder="商家账号">
			   </div>
			 </div> -->
			<el-form-item label="商家账号" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.shangjiazhanghao" autocomplete="off" placeholder="商家账号" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">密码</div>
			   <div class="input-container">
			     <input v-model="ruleForm.mima" class="input" type="text" placeholder="密码">
			   </div>
			 </div> -->
			<el-form-item label="密码" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.mima" autocomplete="off" placeholder="密码" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">店铺名</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianpuming" class="input" type="text" placeholder="店铺名">
			   </div>
			 </div> -->
			<el-form-item label="店铺名" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.dianpuming" autocomplete="off" placeholder="店铺名" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">店铺地址</div>
			   <div class="input-container">
			     <input v-model="ruleForm.dianpudizhi" class="input" type="text" placeholder="店铺地址">
			   </div>
			 </div> -->
			<el-form-item label="店铺地址" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.dianpudizhi" autocomplete="off" placeholder="店铺地址" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">联系方式</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxifangshi" class="input" type="text" placeholder="联系方式">
			   </div>
			 </div> -->
			<el-form-item label="联系方式" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.lianxifangshi" autocomplete="off" placeholder="联系方式" type="text" />
			</el-form-item>
												<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">联系人</div>
			   <div class="input-container">
			     <input v-model="ruleForm.lianxiren" class="input" type="text" placeholder="联系人">
			   </div>
			 </div> -->
			<el-form-item label="联系人" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.lianxiren" autocomplete="off" placeholder="联系人" type="text" />
			</el-form-item>
																					<!-- <div v-if="tableName=='shangjia'" class="input-group">
			   <div class="label">经营范围</div>
			   <div class="input-container">
			     <input v-model="ruleForm.jingyingfanwei" class="input" type="text" placeholder="经营范围">
			   </div>
			 </div> -->
			<el-form-item label="经营范围" class="input" v-if="tableName=='shangjia'">
			  <el-input v-model="ruleForm.jingyingfanwei" autocomplete="off" placeholder="经营范围" type="text" />
			</el-form-item>
																																																																																													<div style="display: flex;flex-wrap: wrap;width: 100%;justify-content: center;">
				<el-button class="btn" type="primary" @click="login()">注册</el-button>
				<el-button class="btn close" type="primary" @click="close()">取消</el-button>
			</div>
		</el-form>
      </div>
      <!-- <div class="nk-navigation">
        <a href="#">
          <div @click="login()">注册</div>
        </a>
      </div> -->
    </div>
  </div>
</template>
<script>
export default {
  data() {
    return {
      ruleForm: {
              },
      tableName:"",
      rules: {}
    };
  },
  mounted(){
    let table = this.$storage.get("loginTable");
    this.tableName = table;
  },
  methods: {
    // 获取uuid
    getUUID () {
      return new Date().getTime();
    },
    close(){
	this.$router.push({ path: "/login" });
    },
    // 注册
    login() {
                              if((!this.ruleForm.yonghuzhanghao) && `yonghu` == this.tableName){
        this.$message.error(`用户账号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `yonghu` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                                                                                                                                    if(`yonghu` == this.tableName && this.ruleForm.nianling&&(!this.$validate.isIntNumer(this.ruleForm.nianling))){
        this.$message.error(`年龄应输入整数`);
        return
      }
                                                                                                                                          if(`yonghu` == this.tableName && this.ruleForm.yonghushouji&&(!this.$validate.isMobile(this.ruleForm.yonghushouji))){
        this.$message.error(`用户手机应输入手机格式`);
        return
      }
                                                      if(`yonghu` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
        this.$message.error(`余额应输入数字`);
        return
      }
                                                                              if((!this.ruleForm.shangjiazhanghao) && `shangjia` == this.tableName){
        this.$message.error(`商家账号不能为空`);
        return
      }
                                                                  if((!this.ruleForm.mima) && `shangjia` == this.tableName){
        this.$message.error(`密码不能为空`);
        return
      }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                        if(`shangjia` == this.tableName && this.ruleForm.money&&(!this.$validate.isNumber(this.ruleForm.money))){
        this.$message.error(`余额应输入数字`);
        return
      }
                                                                                                                                                                                    this.$http({
        url: `${this.tableName}/register`,
        method: "post",
        data:this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "注册成功",
            type: "success",
            duration: 1500,
            onClose: () => {
              this.$router.replace({ path: "/login" });
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
	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked .el-radio__inner {
		border-color: #00c292;
		background: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.el-radio__input.is-checked+.el-radio__label {
		color: #00c292;
	}

	.h1 {
		margin-top: 10px;
	}

	body {
		padding: 0;
		margin: 0;
	}

	// .container {
 //    min-height: 100vh;
 //    text-align: center;
 //    // background-color: #00c292;
 //    padding-top: 20vh;
 //    background-image: url(../assets/img/bg.jpg);
 //    background-size: 100% 100%;
 //    opacity: 0.9;
 //  }

	// .login-form:before {
	// 	vertical-align: middle;
	// 	display: inline-block;
	// }

	// .login-form {
	// 	max-width: 500px;
	// 	padding: 20px 0;
	// 	width: 80%;
	// 	position: relative;
	// 	margin: 0 auto;

	// 	.label {
	// 		min-width: 60px;
	// 	}

	// 	.input-group {
	// 		max-width: 500px;
	// 		padding: 20px 0;
	// 		width: 80%;
	// 		position: relative;
	// 		margin: 0 auto;
	// 		display: flex;
	// 		align-items: center;

	// 		.input-container {
	// 			display: inline-block;
	// 			width: 100%;
	// 			text-align: left;
	// 			margin-left: 10px;
	// 		}

	// 		.icon {
	// 			width: 30px;
	// 			height: 30px;
	// 		}

	// 		.input {
	// 			position: relative;
	// 			z-index: 2;
	// 			float: left;
	// 			width: 100%;
	// 			margin-bottom: 0;
	// 			box-shadow: none;
	// 			border-top: 0px solid #ccc;
	// 			border-left: 0px solid #ccc;
	// 			border-right: 0px solid #ccc;
	// 			border-bottom: 1px solid #ccc;
	// 			padding: 0px;
	// 			resize: none;
	// 			border-radius: 0px;
	// 			display: block;
	// 			width: 100%;
	// 			height: 34px;
	// 			padding: 6px 12px;
	// 			font-size: 14px;
	// 			line-height: 1.42857143;
	// 			color: #555;
	// 			background-color: #fff;
	// 		}

	// 	}
	// }

	.nk-navigation {
		margin-top: 15px;

		a {
			display: inline-block;
			color: #fff;
			background: rgba(255, 255, 255, .2);
			width: 100px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;
		}

		.icon {
			margin-left: 10px;
			width: 30px;
			height: 30px;
		}
	}

	.register-container {
		margin-top: 10px;

		a {
			display: inline-block;
			color: #fff;
			max-width: 500px;
			height: 50px;
			border-radius: 30px;
			text-align: center;
			display: flex;
			align-items: center;
			margin: 0 auto;
			justify-content: center;
			padding: 0 20px;

			div {
				margin-left: 10px;
			}
		}
	}
	
	.container {
		background-image: url("http://codegen.caihongy.cn/20201127/259f8ec2e6ed4e13a61dba16053c8abc.jpg");
		height: 100vh;
		background-position: center center;
		background-size: cover;
		background-repeat: no-repeat;
	
		.login-form {
			right: 50%;
			top: 50%;
			height: auto;
			transform: translate3d(50%, -50%, 0);
			border-radius: 10px;
			background-color: rgba(255,255,255,.5);
			width: 420px;
			padding: 30px 30px 40px 30px;
			font-size: 14px;
			font-weight: 500;
			
			.h1 {
				margin: 0;
				text-align: center;
				line-height: 54px;
			    font-size: 24px;
			    color: #000;
			}
				
			.rgs-form {
				display: flex;
				flex-direction: column;
				justify-content: center;
				align-items: center;
				
				.input {
					width: 100%;
					
					& /deep/ .el-form-item__label {
						line-height: 40px;
						color: rgba(254, 254, 254, 1);
						font-size: #606266;
					}
					
					& /deep/ .el-input__inner {
						height: 40px;
						color: #606266;
						font-size: 14px;
						border-width: 0px;
						border-style: solid;
						border-color: #606266;
						border-radius: 4px;
						background-color: #fff;
					}
				}
				
				.btn {
					margin: 0 10px;
					width: 100px;
					height: 44px;
					color: #fff;
					font-size: 14px;
					border-width: 0px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(249, 104, 104, 0.9);
				}

				.close {
					margin: 0 10px;
					width: 88px;
					height: 44px;
					color: rgba(255, 255, 255, 1);
					font-size: 14px;
					border-width: 1px;
					border-style: solid;
					border-color: #409EFF;
					border-radius: 4px;
					background-color: rgba(249, 104, 104, 0.9);
				}

			}
		}
	}
</style>
