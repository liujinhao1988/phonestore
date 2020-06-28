import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import AddressList from '../views/AddressList.vue'
import AddressNew from '../views/AddressNew.vue'
import AddressEdit from '../views/AddressEdit.vue'
import Detail from '../views/Detail'
import Success from '../views/Success'
import Info from '../views/Info'

Vue.use(VueRouter)

  const routes = [
    {
      path: '/addressEdit',
      name: 'AddressEdit',
      component: AddressEdit
    },
    {
      path: '/addressNew',
      name: 'AddressNew',
      component: AddressNew
    },

    {
      path: '/addressList',
      name: 'AddressList',
      component: AddressList
    },

  {
    path: '/',
    name: 'Home',
    component: Home
  },

  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  },
    {
      path: '/detail',
      name: '订单详情',
      component: Detail
    },
    {
      path: '/success',
      name: '付款成功',
      component: Success
    },
    {
      path: '/info',
      name: '订单信息',
      component: Info
    }

]

const router = new VueRouter({
  routes
})

export default router
