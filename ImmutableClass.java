package com.Immutable;

public class ImmutableClass {

		int i;
		
		ImmutableClass(int i) {
			this.i=i;
			
		}
		public ImmutableClass modify(int i)
		{
			this.i=i;
			return this;
			
		}
				

	}


