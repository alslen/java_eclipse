p a c k a g e   c o l l e c t i o n . a r r a y l i s t ; 
 
 i m p o r t   j a v a . u t i l . A r r a y L i s t ;     / /   ����`�  tИ���  i m p o r t 
 i m p o r t   j a v a . u t i l . I t e r a t o r ; 
 
 i m p o r t   c o l l e c t i o n . M e m b e r ;         
 
 p u b l i c   c l a s s   M e m b e r A r r a y L i s t   { 
 
 	 p r i v a t e   A r r a y L i s t < M e m b e r >   a r r a y L i s t ;     / /   A r r a y L i s t    ���  
 
 	 p u b l i c   M e m b e r A r r a y L i s t ( ) { 
 	 	 a r r a y L i s t   =   n e w   A r r a y L i s t < M e m b e r > ( ) ;     / / d���\�   ���\�  A r r a y L i s t   ��1�
 	 } 
 	 
 	 p u b l i c   v o i d   a d d M e m b e r ( M e m b e r   m e m b e r ) {     / / A r r a y L i s t   ��  d���  �� �
 	 	 a r r a y L i s t . a d d ( m e m b e r ) ; 
 	 } 
 	 
 	 p u b l i c   b o o l e a n   r e m o v e M e m b e r ( i n t   m e m b e r I d ) {     / /   d���  D�t��|�  �����\�,   ���  �ŀ�|�  �X�
 	 	 
 	 	 f o r ( i n t   i   = 0 ;   i < a r r a y L i s t . s i z e ( ) ;   i + + ) {   / /   t���  D�t��|�   ���  d���|�  A r r a y L i s t ���  >�L�
 	 	 	 M e m b e r   m e m b e r   =   a r r a y L i s t . g e t ( i ) ; 
 	 	 	 i n t   t e m p I d   =   m e m b e r . g e t M e m b e r I d ( ) ; 
 	 	 	 i f ( t e m p I d   = =   m e m b e r I d ) {                         / /   d���D�t�� �  �����@�  |�X�X�t�  
 	 	 	 	 a r r a y L i s t . r e m o v e ( i ) ;                       / /   t���  d���|�  ���
 	 	 	 	 r e t u r n   t r u e ;                                       / /   t r u e   �X�
 	 	 	 } 
 	 	 } 
 	 	 
 	 	 I t e r a t o r < M e m b e r >   i r   =   a r r a y L i s t . i t e r a t o r ( ) ; 
 	 	 w h i l e ( i r . h a s N e x t ( ) )   { 
 	 	 	 M e m b e r   m e m b e r   =   i r . n e x t ( ) ; 
 	 	 	 i n t   t e m p I d   =   m e m b e r . g e t M e m b e r I d ( ) ; 
 	 	 	 i f ( t e m p I d   = =   m e m b e r I d ) {                         / /   d���D�t�� �  �����@�  |�X�X�t�  
 	 	 	 	 a r r a y L i s t . r e m o v e ( m e m b e r ) ;                       / /   t���  d���|�  ���
 	 	 	 	 r e t u r n   t r u e ;                                       / /   t r u e   �X�
 	 	 	 } 
 	 	 } 
 	 	 
 	 	 S y s t e m . o u t . p r i n t l n ( m e m b e r I d   +   "  �  tȬ�X���  Jŵ�Ȳ�" ) ;     / / f o r    �  ]���L�  L���  r e t u r n   t�  H������
 	 	 r e t u r n   f a l s e ;                                       
 	 } 
 	 
 	 p u b l i c   v o i d   s h o w A l l M e m b e r ( ) { 
 	 	 f o r ( M e m b e r   m e m b e r   :   a r r a y L i s t ) { 
 	 	 	 / /   O b j e c t   �X�  t o S t r i n g t�  8֜�  ���  ��t�  D�Ȳ�, 
 	 	 	 / /   M e m b e r   ����  ���X��  t o S t r i n g t�  8֜�t�  ��. 
 	 	 	 / /   M e m b e r ���  -�  U�x�t�����. 
 	 	 	 S y s t e m . o u t . p r i n t l n ( m e m b e r ) ; 
 	 	 } 
 	 	 S y s t e m . o u t . p r i n t l n ( ) ; 
 	 } 
 } 
 