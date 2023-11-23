
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AvatarAvatarManager from "./components/listers/AvatarAvatarCards"
import AvatarAvatarDetail from "./components/listers/AvatarAvatarDetail"

import MonsterMonsterManager from "./components/listers/MonsterMonsterCards"
import MonsterMonsterDetail from "./components/listers/MonsterMonsterDetail"

import BattleBattleManager from "./components/listers/BattleBattleCards"
import BattleBattleDetail from "./components/listers/BattleBattleDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/avatars/avatars',
                name: 'AvatarAvatarManager',
                component: AvatarAvatarManager
            },
            {
                path: '/avatars/avatars/:id',
                name: 'AvatarAvatarDetail',
                component: AvatarAvatarDetail
            },

            {
                path: '/monsters/monsters',
                name: 'MonsterMonsterManager',
                component: MonsterMonsterManager
            },
            {
                path: '/monsters/monsters/:id',
                name: 'MonsterMonsterDetail',
                component: MonsterMonsterDetail
            },

            {
                path: '/battles/battles',
                name: 'BattleBattleManager',
                component: BattleBattleManager
            },
            {
                path: '/battles/battles/:id',
                name: 'BattleBattleDetail',
                component: BattleBattleDetail
            },



    ]
})
