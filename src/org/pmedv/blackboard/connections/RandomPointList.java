package org.pmedv.blackboard.connections;

//
//  (C) 1997 Sergey Solyanik.
//
//  This program is not in public domain.
//
//  All rights to distribute are hereby granted under GNU Public License.
//
//  THIS CODE AND INFORMATION IS PROVIDED "AS IS" WITHOUT WARRANTY OF
//  ANY KIND, EITHER EXPRESSED OR IMPLIED, INCLUDING BUT NOT LIMITED TO
//  THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR FITNESS FOR A
//  PARTICULAR PURPOSE.
//
public class RandomPointList
    {
    public RandomPointList next;
    
    public double x, y;

    public RandomPointList (double x1, double y1, RandomPointList n)
        {
        x = x1;
        y = y1;
        next = n;
        }
    }