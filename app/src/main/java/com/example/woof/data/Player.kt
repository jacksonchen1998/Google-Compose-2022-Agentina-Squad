/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.woof.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.woof.R

/**
 * A data class to represent the information presented in the dog card
 */
data class Player(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val age: Int,
    @StringRes val des: Int
)

val player = listOf(
    Player(R.drawable._01, R.string.player_name_1, 36, R.string.player_description_1),
    Player(R.drawable._02, R.string.player_name_2, 24, R.string.player_description_2),
    Player(R.drawable._03, R.string.player_name_3, 30, R.string.player_description_3),
    Player(R.drawable._04, R.string.player_name_4, 25, R.string.player_description_4),
    Player(R.drawable._05, R.string.player_name_5, 28, R.string.player_description_5),
    Player(R.drawable._06, R.string.player_name_6, 31, R.string.player_description_6),
    Player(R.drawable._07, R.string.player_name_7, 28, R.string.player_description_7),
    Player(R.drawable._08, R.string.player_name_8, 31, R.string.player_description_8),
    Player(R.drawable._09, R.string.player_name_9, 22, R.string.player_description_9),
    Player(R.drawable._10, R.string.player_name_10, 35, R.string.player_description_10),
    Player(R.drawable._11, R.string.player_name_11, 34, R.string.player_description_11),
    Player(R.drawable._12, R.string.player_name_12, 30, R.string.player_description_12),
    Player(R.drawable._13, R.string.player_name_13, 24, R.string.player_description_13),
    Player(R.drawable._14, R.string.player_name_14, 24, R.string.player_description_14),
    Player(R.drawable._15, R.string.player_name_15, 27, R.string.player_description_15),
    Player(R.drawable._16, R.string.player_name_16, 21, R.string.player_description_16),
    Player(R.drawable._17, R.string.player_name_17, 34, R.string.player_description_17),
    Player(R.drawable._18, R.string.player_name_18, 28, R.string.player_description_18),
    Player(R.drawable._19, R.string.player_name_19, 34, R.string.player_description_19),
    Player(R.drawable._20, R.string.player_name_20, 23, R.string.player_description_20),
    Player(R.drawable._21, R.string.player_name_21, 29, R.string.player_description_21),
    Player(R.drawable._22, R.string.player_name_22, 25, R.string.player_description_22),
    Player(R.drawable._23, R.string.player_name_23, 30, R.string.player_description_23),
    Player(R.drawable._24, R.string.player_name_24, 21, R.string.player_description_24),
    Player(R.drawable._23, R.string.player_name_25, 24, R.string.player_description_25),
    Player(R.drawable._24, R.string.player_name_26, 24, R.string.player_description_26)
)